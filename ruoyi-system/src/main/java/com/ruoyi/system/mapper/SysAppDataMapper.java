package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysAppData;

/**
 * 编码申请数据Mapper接口
 * 
 * @author ruoyi
 * @date 2021-09-29
 */
public interface SysAppDataMapper 
{
    /**
     * 查询编码申请数据
     * 
     * @param appDataId 编码申请数据主键
     * @return 编码申请数据
     */
    public SysAppData selectSysAppDataByAppDataId(Long appDataId);

    /**
     * 查询编码申请数据列表
     * 
     * @param sysAppData 编码申请数据
     * @return 编码申请数据集合
     */
    public List<SysAppData> selectSysAppDataList(SysAppData sysAppData);

    /**
     * 新增编码申请数据
     * 
     * @param sysAppData 编码申请数据
     * @return 结果
     */
    public int insertSysAppData(SysAppData sysAppData);

    /**
     * 修改编码申请数据
     * 
     * @param sysAppData 编码申请数据
     * @return 结果
     */
    public int updateSysAppData(SysAppData sysAppData);

    /**
     * 删除编码申请数据
     * 
     * @param appDataId 编码申请数据主键
     * @return 结果
     */
    public int deleteSysAppDataByAppDataId(Long appDataId);

    /**
     * 批量删除编码申请数据
     * 
     * @param appDataIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysAppDataByAppDataIds(String[] appDataIds);
}
