package tjresearch.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import tjresearch.pojo.AddFormSelect;
import tjresearch.pojo.Area;
import tjresearch.pojo.Item;
import tjresearch.pojo.ItemAddEdit;
import tjresearch.pojo.ItemView;
import tjresearch.pojo.PageItem;
import tjresearch.pojo.SearchData;
import tjresearch.service.DataService;

@RestController
public class DataController {
	@Autowired
	private DataService dataService;
//	/**
//	 * 查询所有的item数据
//	 * @param 当前页数
//	 * @param 每页显示的条数
//	 * @return
//	 */
//	@RequestMapping("/showItem")
//	@ResponseBody
//	public PageItem showItem(@RequestParam(required = true, defaultValue = "1") Integer pageNum,
//            @RequestParam(required = true, defaultValue = "20") Integer pageSize){
//		PageHelper.startPage(pageNum, pageSize);// 默认从第一页开始，每页20条
//		List<Item> itemList = dataService.findAllItem(); 
//		PageInfo<Item> pageUser = new PageInfo<Item>(itemList);
//		int allPage = pageUser.getPages();
//		long total = pageUser.getTotal();
//		PageItem pageItem = new PageItem();
//		pageItem.setAllPage(allPage);
//		pageItem.setTotal(total);
//		pageItem.setList(itemList);
//		return pageItem;
//	}
	//点击添加按钮，获取部分下拉列表数据
	@RequestMapping("/addItemEdit")
	@ResponseBody
	public AddFormSelect addItemEdit(){
		AddFormSelect addItemEdit = dataService.addItemEdit();
		return addItemEdit;
	}
	//下拉列表地区
	@RequestMapping("/getArea")
	@ResponseBody
	public List<Area> getCityByProvince(HttpServletRequest req,HttpServletResponse resp){
		String areaId = req.getParameter("areaId");
		List<Area> cityList = dataService.getCityByProvince(areaId);
		return cityList;
	}
	//新增保存
	@RequestMapping("/addItemSave")
	public void addItemSave(HttpServletRequest req,HttpServletResponse resp){
		String itemName = req.getParameter("itemName");
		String itemUnit = req.getParameter("itemUnit");
		String frequency = req.getParameter("frequency");
		String datatype = req.getParameter("datatype");
		String indusName = req.getParameter("indusName");
		String indexName = req.getParameter("indexName");
		String itemCode = req.getParameter("itemCode");
		String areaName = req.getParameter("areaName");
		ItemAddEdit itemAddEdit = new ItemAddEdit(itemName, itemUnit, frequency, datatype, indusName, indexName, itemCode, areaName);
		dataService.insertItem(itemAddEdit);
	}
	//编辑回显
	@RequestMapping("/itemUpdateView")
	@ResponseBody
	public ItemView itemUpdateView(HttpServletRequest req,HttpServletResponse resp){
		String itemId = req.getParameterNames().nextElement();
		ItemView itemView= dataService.itemUpdateView(itemId);
		return itemView;
	}
	//编辑页保存
	@RequestMapping("/updateItemSave")
	public void updateItemSave(HttpServletRequest req,HttpServletResponse resp){
		String itemId = req.getParameter("itemId");
		String itemName = req.getParameter("itemName");
		String itemUnit = req.getParameter("itemUnit");
		String frequency = req.getParameter("frequency");
		String datatypeId = req.getParameter("datatype");
		String indusId = req.getParameter("indusName");
		String indexId = req.getParameter("indexName");
		String itemCode = req.getParameter("itemCode");
		String areaId = req.getParameter("areaName");
		ItemAddEdit itemAddEdit = new ItemAddEdit(itemId, itemName, itemUnit, frequency, datatypeId, indusId, indexId, itemCode, areaId);
		dataService.updateItemSave(itemAddEdit);
	}
	@RequestMapping("/deleteItemList")
	@ResponseBody
	public JSONObject deleteItemList(HttpServletRequest req,HttpServletResponse resp){
		JSONObject jsonObject = new JSONObject();
		if(req.getParameterNames()!=null && req.getParameterNames().hasMoreElements()){
			String itemId = req.getParameterNames().nextElement();
			dataService.deleteItemList(itemId);
			jsonObject.put("status", "success");
		}else{
			jsonObject.put("status", "fail");
		}
		return jsonObject;
		
	}
	@RequestMapping("/findItem")
	@ResponseBody
	public PageItem findItem(SearchData searchData,
			@RequestParam(required = true, defaultValue = "1") Integer pageNum,
            @RequestParam(required = true, defaultValue = "15") Integer pageSize){
		
		if(searchData.getSearchName() == null || "".equals(searchData.getSearchName())){
			PageHelper.startPage(pageNum, pageSize);// 默认从第一页开始，每页20条
			List<Item> itemList = dataService.findAllItem(); 
			PageInfo<Item> pageUser = new PageInfo<Item>(itemList);
			int allPage = pageUser.getPages();
			long total = pageUser.getTotal();
			PageItem pageItem = new PageItem();
			pageItem.setAllPage(allPage);
			pageItem.setTotal(total);
			pageItem.setList(itemList);
			return pageItem;
		}else{
			String searchName = searchData.getSearchName();
			searchName = "%"+searchName+"%";
			int id = searchData.getSearchId();
			
			if(id>0){
				PageHelper.startPage(pageNum, pageSize);// 默认从第一页开始，每页20条
				List<Item> itemList = dataService.findItemByItemId(id);
				PageInfo<Item> pageUser = new PageInfo<Item>(itemList);
				int allPage = pageUser.getPages();
				long total = pageUser.getTotal();
				PageItem pageItem = new PageItem();
				pageItem.setAllPage(allPage);
				pageItem.setTotal(total);
				pageItem.setList(itemList);
				return pageItem;
			}else{
				PageHelper.startPage(pageNum, pageSize);// 默认从第一页开始，每页20条
				List<Item> itemList = dataService.findItemByItemName(searchName); 
				PageInfo<Item> pageUser = new PageInfo<Item>(itemList);
				int allPage = pageUser.getPages();
				long total = pageUser.getTotal();
				PageItem pageItem = new PageItem();
				pageItem.setAllPage(allPage);
				pageItem.setTotal(total);
				pageItem.setList(itemList);
				return pageItem;
				
			}
		}
	}
	@RequestMapping("/tipFindItem")
	@ResponseBody
	public List<SearchData> tipFindItem(HttpServletRequest req){
		String itemName = req.getParameter("searchName");
		itemName = "%"+itemName+"%";
		List<SearchData> itemNameList = dataService.findItemNameByName(itemName);
		return itemNameList;
		
	}
	



}
