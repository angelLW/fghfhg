package tjresearch.pojo;

import java.util.List;

public class ItemView {
	private int itemId;
	private String itemName;
	private String itemUnit;
	private String frequencyName;
	private int frequencyId;
	private String datatypeName;
	private int datatypeId;
	private String indusName;
	private int indusId;
	private String indexCode;
	private int indexId;
	private String itemCode;
	private String areaName;
	private int areaId;
	private List<Area> areaView;
	
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	
	public List<Area> getAreaView() {
		return areaView;
	}
	public void setAreaView(List<Area> areaView) {
		this.areaView = areaView;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getFrequencyName() {
		return frequencyName;
	}
	public void setFrequencyName(String frequencyName) {
		this.frequencyName = frequencyName;
	}
	public int getFrequencyId() {
		return frequencyId;
	}
	public void setFrequencyId(int frequencyId) {
		this.frequencyId = frequencyId;
	}
	public int getDatatypeId() {
		return datatypeId;
	}
	public void setDatatypeId(int datatypeId) {
		this.datatypeId = datatypeId;
	}
	public int getIndusId() {
		return indusId;
	}
	public void setIndusId(int indusId) {
		this.indusId = indusId;
	}
	public int getIndexId() {
		return indexId;
	}
	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public String getDatatypeName() {
		return datatypeName;
	}
	public void setDatatypeName(String datatypeName) {
		this.datatypeName = datatypeName;
	}
	public String getIndusName() {
		return indusName;
	}
	public void setIndusName(String indusName) {
		this.indusName = indusName;
	}

	public String getIndexCode() {
		return indexCode;
	}
	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	

}
