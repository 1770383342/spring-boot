package com.example.mapper;

import com.example.domain.Comment;
import org.apache.ibatis.annotations.*;

import java.awt.*;

@Mapper //表示该类是一个mybatisjie'k文件，是需要被springboot进行扫描的
public interface CommentMapper {

    //查询
    @Select("select * from t_comment where id = #{id}")
    public Comment findById(int i);

    //添加
    @Insert("insert into t_comment value(#{id},#{content},#{author},#{aId})")
    public  void insertComment(Comment comment);

    //修改
    @Update("updata t_comment set content=#{content} where id = #{id}")
    public void updateComment(Comment comment);

    //删除
    @Delete("delete from t_comment where id = #{id}")
    public void deleteComment(Insert id);
}
