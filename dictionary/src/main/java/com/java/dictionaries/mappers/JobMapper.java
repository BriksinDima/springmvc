package com.java.dictionaries.mappers;

import com.java.dictionaries.enities.job.JobType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface JobMapper {

    @Select("SELECT * FROM job_type WHERE id = #{id}")
    JobType getJobTypeById(@Param("id") int id);

    @Insert("INSERT INTO job_type(title, number) VALUES (#{title}, #{number}")
    void insertJobType(JobType jobType);

}
