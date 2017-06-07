package com.braven.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.braven.demo.domain.Post;
import com.braven.demo.domain.PostExample;
import com.braven.demo.domain.PostWithBLOBs;

public interface PostMapper {
	int countByExample(PostExample example);

	int deleteByExample(PostExample example);

	int deleteByPrimaryKey(Long id);

	int insert(PostWithBLOBs record);

	int insertSelective(PostWithBLOBs record);

	List<PostWithBLOBs> selectByExampleWithBLOBsWithRowbounds(PostExample example, RowBounds rowBounds);

	List<PostWithBLOBs> selectByExampleWithBLOBs(PostExample example);

	List<Post> selectByExampleWithRowbounds(PostExample example, RowBounds rowBounds);

	List<Post> selectByExample(PostExample example);

	PostWithBLOBs selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

	int updateByExampleWithBLOBs(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

	int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

	int updateByPrimaryKeySelective(PostWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(PostWithBLOBs record);

	int updateByPrimaryKey(Post record);
}