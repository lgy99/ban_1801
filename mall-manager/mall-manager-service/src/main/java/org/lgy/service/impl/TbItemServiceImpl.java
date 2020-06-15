package org.lgy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lgy.mapper.TbItemMapper;
import org.lgy.pojo.TbItem;
import org.lgy.pojo.TbItemExample;
import org.lgy.service.TbItemService;
import org.lgy.utils.EasyUIDataGridResult;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TbItemServiceImpl implements TbItemService {

	@Resource
	private  TbItemMapper tbItemMapper;
	@Override
	public EasyUIDataGridResult getTbItemList(Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		TbItemExample example = new TbItemExample();
		 List<TbItem> list = tbItemMapper.selectByExample(example);
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total,list);
		return easyUIDataGridResult;
	}
	
}
