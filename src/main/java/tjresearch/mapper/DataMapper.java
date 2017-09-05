package tjresearch.mapper;




import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tjresearch.pojo.Area;
import tjresearch.pojo.DataType;
import tjresearch.pojo.Index;
import tjresearch.pojo.Industry;
import tjresearch.pojo.Item;
import tjresearch.pojo.ItemAddEdit;
import tjresearch.pojo.ItemView;
import tjresearch.pojo.SearchData;


@Mapper
public interface DataMapper {

	List<Item> queryAllItem();

	List<Index> queryAllIndex();

	List<Industry> queryAllIndustry();

	List<DataType> queryAllDataType();

	List<Area> queryAllProvince();

	List<Area> queryAreaByAreaId(String provinceId);

	int findFreqIdByName(String freqName);

	void insertItem(ItemAddEdit itemAddEdit);

	ItemView itemUpdateView(String itemId);

	void updateItemSave(ItemAddEdit itemAddEdit);

	Area findAreaById(int areaId);

	void deleteItemList(String itemId);

	List<Item> queryItemByItemName(String itemName);

	List<SearchData> queryItemNameByName(String itemName);

	List<Item> queryItemByItemId(int id);



}
