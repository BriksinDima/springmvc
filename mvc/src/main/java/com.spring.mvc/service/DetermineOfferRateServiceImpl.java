package com.spring.mvc.service;

import com.model.entities.Application;
import com.model.entities.ClientCard;
import com.model.entities.personaldata.PersonalData;
import com.spring.mvc.dao.ClientCardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
public class DetermineOfferRateServiceImpl implements DetermineOfferRateService {

    @Autowired
    ClientCardDao clientCardDao;

    @Override
    @Transactional
    public Double determineOfferRate(String id) {
        Double initialRate = 20d;
        ClientCard clientCard = clientCardDao.getClientCardById(id);
        initialRate = checkBirthDate(initialRate,clientCard.getBorrower().getPersonalData());
        initialRate = checkApplication(initialRate, clientCard.getApplicationList().get(0));
        initialRate = checkCardHolder(initialRate, clientCard.getBorrower().getPersonalData().getCardHolder());
        return initialRate;
    }

    private Double checkBirthDate(Double rate, PersonalData pd){
        if(pd.getBirthDate().isBefore(LocalDate.of(2000, 2, 3))){
           return rate-=1;
        }
        return rate;
    }

    private  Double checkCardHolder(Double rate, Boolean cardHolder){
        if(cardHolder)return rate-=0.5;
        return rate;
    }
    private Double checkApplication(Double rate, Application application){
        if(application.getAmount() > 30000 || application.getDuration() > 360)return rate-=3;
        return rate;
    }

}
