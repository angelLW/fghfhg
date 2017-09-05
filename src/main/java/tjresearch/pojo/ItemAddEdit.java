package tjresearch.pojo;

public class ItemAddEdit {
	private String itemId;
	private String itemName;
	private String itemUnit;
	private String frequency;
	private String datatypeId;
	private String indusId;
	private String indexId;
	private String itemCode;
	private String areaId;
	private Integer freqId;
	public ItemAddEdit() {
	}
	
	public ItemAddEdit(String itemName, String itemUnit, String frequency, String datatypeId, String indusId,
			String indexId, String itemCode, String areaId) {
		super();
		this.itemName = itemName;
		this.itemUnit = itemUnit;
		this.frequency = frequency;
		this.datatypeId = datatypeId;
		this.indusId = indusId;
		this.indexId = indexId;
		this.itemCode = itemCode;
		this.areaId = areaId;
	}

	public ItemAddEdit(String itemId, String itemName, String itemUnit, String frequency, String datatypeId,
			String indusId, String indexId, String itemCode, String areaId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemUnit = itemUnit;
		this.frequency = frequency;
		this.datatypeId = datatypeId;
		this.indusId = indusId;
		this.indexId = indexId;
		this.itemCode = itemCode;
		this.areaId = areaId;
	}

	public Integer getFreqId() {
		return freqId;
	}

	public void setFreqId(Integer freqId) {
		this.freqId = freqId;
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
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getDatatypeId() {
		return datatypeId;
	}
	public void setDatatypeId(String datatypeId) {
		this.datatypeId = datatypeId;
	}
	public String getIndusId() {
		return indusId;
	}
	public void setIndusId(String indusId) {
		this.indusId = indusId;
	}
	public String getIndexId() {
		return indexId;
	}
	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "ItemAddEdit [itemName=" + itemName + ", itemUnit=" + itemUnit + ", frequency=" + frequency
				+ ", datatypeId=" + datatypeId + ", indusId=" + indusId + ", indexId=" + indexId + ", itemCode="
				+ itemCode + ", areaId=" + areaId + "]";
	}


}
