package cn.e3mall.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
@Service
public class ItemServiceIpml implements ItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem getTbItemById(Long id) {
		return tbItemMapper.selectByPrimaryKey(id);
		 
	}

}
