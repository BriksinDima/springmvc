package com.spring.mvc.test;

import com.spring.mvc.service.DetermineOfferRateService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class DetermineOfferRateServiceTest {

    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;

    @Qualifier("determineOfferRateServiceImpl")
    private DetermineOfferRateService offerRateService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testDetermineOfferRateServiceImpl() throws Exception {
      //  if(offerRateService == null)return;
      //  System.out.println("!!!!!!!!");
        offerRateService.determineOfferRate("4028b8816c85f50c016c85fe4aa70019");
    }
}