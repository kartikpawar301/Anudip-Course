package com.ims.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.entity.DefectiveItems;
import com.ims.exception.DefectiveItemsIdNotFoundException;
import com.ims.model.DefectiveItemsDTO;
import com.ims.repository.DefectiveItemsRepository;
import com.ims.service.DefectiveItemsService;
import com.ims.util.DefectiveItemsConverter;

@Service
public class DefectiveItemsServiceImpl implements DefectiveItemsService{

	@Autowired
	DefectiveItemsRepository defectiveItemsRepository;
	
	@Autowired
	DefectiveItemsConverter defectiveItemsConverter;
	
	@Override
	public DefectiveItemsDTO addDefectiveItems(DefectiveItems defectiveItems) {
		
		defectiveItemsRepository.save(defectiveItems);
		return defectiveItemsConverter.convertToDefectiveItemsDTO(defectiveItems);
	}

	@Override
	public DefectiveItems getDefectiveItemsById(int defectiveItemsId) {
		
		return defectiveItemsRepository.findById(defectiveItemsId).orElseThrow( ()-> new DefectiveItemsIdNotFoundException("Defective item id is not found"));
	}

	@Override
	public DefectiveItems updateDefectiveItemsDetails(DefectiveItems defectiveItems, int defectiveItemsId) {
		
		DefectiveItems updateDefectiveItems = defectiveItemsRepository.findById(defectiveItemsId).orElseThrow( ()-> new DefectiveItemsIdNotFoundException("Defective item id is not correct"));
		updateDefectiveItems.setProduct(updateDefectiveItems.getProduct());
		updateDefectiveItems.setSupplier(updateDefectiveItems.getSupplier());
		
		defectiveItemsRepository.save(updateDefectiveItems);
		
		return updateDefectiveItems;
	}

	@Override
	public void deleteDefectiveItems(int defectiveItemsId) {
		
		defectiveItemsRepository.findById(defectiveItemsId).orElseThrow( ()-> new DefectiveItemsIdNotFoundException("Defective item id is not correct"));
		defectiveItemsRepository.deleteById(defectiveItemsId);
	}

	@Override
	public List<DefectiveItemsDTO> getAllDefectiveItems() {
		
		List<DefectiveItems> defectiveItems = defectiveItemsRepository.findAll();
		
		List<DefectiveItemsDTO> dtoList = new ArrayList<>();
		for(DefectiveItems d: defectiveItems)
		{
			dtoList.add(defectiveItemsConverter.convertToDefectiveItemsDTO(d));
		}
		return dtoList;
	}

}
