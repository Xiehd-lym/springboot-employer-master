package cn.qqcn.common.general;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
//通用接口,自动继承tk的方法
public interface GeneralDAO<T> extends Mapper<T>, MySqlMapper<T> {

}
