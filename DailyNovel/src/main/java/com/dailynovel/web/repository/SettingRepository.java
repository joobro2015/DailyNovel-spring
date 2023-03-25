package com.dailynovel.web.repository;


import org.apache.ibatis.annotations.Mapper;

import com.dailynovel.web.entity.Setting;

@Mapper
public interface SettingRepository {
	
	Setting findById(Integer id); 
	int updateProfile(Setting setting);
	int deleteAcount(Integer id);
	

}
