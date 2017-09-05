package tjresearch.pojo;

import java.util.List;

public class AddFormSelect {
	private List<Index> index;
	private List<Industry> industry;
	private List<DataType> dataType;
	private List<Area> area;
	
	public AddFormSelect(List<Index> index, List<Industry> industry, List<DataType> dataType, List<Area> area) {
		this.index = index;
		this.industry = industry;
		this.dataType = dataType;
		this.area = area;
	}
	public List<Index> getIndex() {
		return index;
	}
	public void setIndex(List<Index> index) {
		this.index = index;
	}
	public List<Industry> getIndustry() {
		return industry;
	}
	public void setIndustry(List<Industry> industry) {
		this.industry = industry;
	}
	public List<DataType> getDataType() {
		return dataType;
	}
	public void setDataType(List<DataType> dataType) {
		this.dataType = dataType;
	}
	public List<Area> getArea() {
		return area;
	}
	public void setArea(List<Area> area) {
		this.area = area;
	}
	

}
