package tjresearch.service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tjresearch.mapper.DataMapper;
import tjresearch.pojo.AddFormSelect;
import tjresearch.pojo.Area;
import tjresearch.pojo.DataType;
import tjresearch.pojo.Index;
import tjresearch.pojo.Industry;
import tjresearch.pojo.Item;
import tjresearch.pojo.ItemAddEdit;
import tjresearch.pojo.ItemView;
import tjresearch.pojo.SearchData;

@Service
@MapperScan("tjresearch.Mapper")
public class DataService {
	@Autowired
	private DataMapper dataMapper;

	public List<Item> findAllItem() {
		List<Item> itemDatas = dataMapper.queryAllItem();
		return itemDatas;
	}

	public AddFormSelect addItemEdit() {
		List<Index> indexList = dataMapper.queryAllIndex();
		List<Industry> industryList = dataMapper.queryAllIndustry();
		List<DataType> dataTypeList = dataMapper.queryAllDataType();
		List<Area> areaList = dataMapper.queryAllProvince();
		AddFormSelect addFormSelect = new AddFormSelect(indexList, industryList, dataTypeList, areaList);
		return addFormSelect;
	}

	public List<Area> getCityByProvince(String provinceId) {
		return dataMapper.queryAreaByAreaId(provinceId);
	}

	public void insertItem(ItemAddEdit itemAddEdit) {
		String freqName = itemAddEdit.getFrequency();
		int freqId = dataMapper.findFreqIdByName(freqName);
		itemAddEdit.setFreqId(freqId);
		dataMapper.insertItem(itemAddEdit);
	}

	public ItemView itemUpdateView(String itemId) {
		ItemView itemView = dataMapper.itemUpdateView(itemId);
		int areaId = itemView.getAreaId();
		List<Area> areaList = new ArrayList<Area>();
		List<Area> areaListfin = new ArrayList<Area>();
		//通过id获取地区信息
		Area area = dataMapper.findAreaById(areaId);
		areaList.add(area);
		while(area.getParentId()!=0){//上一级不是省
			area = dataMapper.findAreaById(area.getParentId());//获取上一级行政区
			areaList.add(area);
		}
		for(int j = areaList.size();j>0;j--){
			areaListfin.add(areaList.get(j-1));
		}
		itemView.setAreaView(areaListfin);
		return itemView;
		
	}

	public void updateItemSave(ItemAddEdit itemAddEdit) {
		String freqName = itemAddEdit.getFrequency();
		int freqId = dataMapper.findFreqIdByName(freqName);
		itemAddEdit.setFreqId(freqId);
		dataMapper.updateItemSave(itemAddEdit);
		
	}

	public void deleteItemList(String itemId) {
		dataMapper.deleteItemList(itemId);
	}

	public List<Item> findItemByItemName(String itemName) {
		List<Item> itemDatas = dataMapper.queryItemByItemName(itemName);
		return itemDatas;
	}

	public List<SearchData> findItemNameByName(String itemName) {
		return dataMapper.queryItemNameByName(itemName);
	}

	public List<Item> findItemByItemId(int id) {
		return dataMapper.queryItemByItemId(id);
	}

}
