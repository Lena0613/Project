package com.eeit144.drinkmaster.back.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.eeit144.drinkmaster.back.model.StoreService;
import com.eeit144.drinkmaster.bean.FirmBean;
import com.eeit144.drinkmaster.bean.StoreBean;
import com.eeit144.drinkmaster.dao.StoreRepostiory;

@Service
@Transactional
public class StoreServiceImp implements StoreService {
	
	private StoreRepostiory storeDao;
	
	@Autowired
	public StoreServiceImp(StoreRepostiory storeDao) {
		super();
		this.storeDao = storeDao;
	}

	@Override
	public Optional<StoreBean> findById(Integer id) {
		return storeDao.findById(id);
	}

	@Override
	public Page<StoreBean> findAll(Pageable pab) {
		return storeDao.findAll(pab);
	}
	

	@Override
	public void deleteById(Integer id) {
		storeDao.deleteById(id);
	}

	@Override
	public void insertStore(StoreBean store) {
		storeDao.save(store);
	}

	@Override
	public Optional<StoreBean> findStoreByUserId(Integer userId){
		return storeDao.findByUserBean_userId(userId);
	}

	@Override
	public Page<StoreBean> findStoreByFirmId(Integer firmId, Pageable pab) {
		return storeDao.findByFirmBean_firmId(firmId, pab);
	}

	@Override
	public FirmBean findFirmBeanByStoreId(Integer storeId) {
		return storeDao.findFirmBeanByStoreId(storeId);
	}
	
	@Override
	public List<StoreBean> findAllList(){
		return storeDao.findAll();
	}
	
	@Override
	public List<StoreBean> findStoreByFirmId(Integer firmId){
		return storeDao.findByFirmBean_firmId(firmId);
	}

	@Override
	public List<Integer> findStoreUserNull(){
		return storeDao.findStoreUserNull();
	}
	@Override
	public List<StoreBean> findAll(List<Integer> ids){
		return storeDao.findAllById(ids);
	}
	
}
