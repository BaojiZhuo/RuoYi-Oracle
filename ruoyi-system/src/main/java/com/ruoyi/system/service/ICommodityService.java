package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Commodity;

/**
 * CC码Service接口
 * 
 * @author ruoyi
 * @date 2021-09-02
 */
public interface ICommodityService 
{
    /**
     * 查询CC码
     * 
     * @param commodityNo CC码主键
     * @return CC码
     */
    public Commodity selectCommodityByCommodityNo(Long commodityNo);

    /**
     * 查询CC码列表
     * 
     * @param commodity CC码
     * @return CC码集合
     */
    public List<Commodity> selectCommodityList(Commodity commodity);

    /**
     * 新增CC码
     * 
     * @param commodity CC码
     * @return 结果
     */
    public int insertCommodity(Commodity commodity);

    /**
     * 修改CC码
     * 
     * @param commodity CC码
     * @return 结果
     */
    public int updateCommodity(Commodity commodity);

    /**
     * 批量删除CC码
     * 
     * @param commodityNos 需要删除的CC码主键集合
     * @return 结果
     */
    public int deleteCommodityByCommodityNos(String commodityNos);

    /**
     * 删除CC码信息
     * 
     * @param commodityNo CC码主键
     * @return 结果
     */
    public int deleteCommodityByCommodityNo(Long commodityNo);
}
