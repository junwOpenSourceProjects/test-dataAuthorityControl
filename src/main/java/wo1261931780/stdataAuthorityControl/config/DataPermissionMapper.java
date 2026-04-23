package wo1261931780.stdataAuthorityControl.config;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-dataAuthorityControl
 * Package:wo1261931780.stdataAuthorityControl.config
 *
 * @author liujiajun_junw
 * @Date 2024-05-22-22  星期五
 * @Description
 */
public interface DataPermissionMapper<T> extends BaseMapper<T> {

	/**
	 * 根据 ID 查询
	 *
	 * @param id 主键ID
	 */
	@Override
	@UserDataPermission
	T selectById(Serializable id);

	/**
	 * 查询（根据ID 批量查询）
	 *
	 * @param idList 主键ID列表(不能为 null 以及 empty)
	 */
	@Override
	@UserDataPermission
	List<T> selectBatchIds(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList);

	/**
	 * 查询（根据 columnMap 条件）
	 *
	 * @param columnMap 表字段 map 对象
	 */
	@Override
	@UserDataPermission
	List<T> selectByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap);

	/**
	 * 根据 entity 条件，查询一条记录
	 *
	 * @param queryWrapper 实体对象封装操作类（可以为 null）
	 */
	@Override
	@UserDataPermission
	T selectOne(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

	/**
	 * 根据 Wrapper 条件，查询总记录数
	 *
	 * @param queryWrapper 实体对象封装操作类（可以为 null）
	 */
	@Override
	@UserDataPermission
	Long selectCount(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

	/**
	 * 根据 entity 条件，查询全部记录
	 *
	 * @param queryWrapper 实体对象封装操作类（可以为 null）
	 */
	@Override
	@UserDataPermission
	List<T> selectList(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

	/**
	 * 根据 Wrapper 条件，查询全部记录
	 *
	 * @param queryWrapper 实体对象封装操作类（可以为 null）
	 */
	@Override
	@UserDataPermission
	List<Map<String, Object>> selectMaps(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

	/**
	 * 根据 Wrapper 条件，查询全部记录
	 * <p>注意： 只返回第一个字段的值</p>
	 *
	 * @param queryWrapper 实体对象封装操作类（可以为 null）
	 */
	// @Override
	// @UserDataPermission
	// List<Object> selectObjs(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

	/**
	 * 根据 entity 条件，查询全部记录（并翻页）
	 *
	 * @param page         分页查询条件（可以为 RowBounds.DEFAULT）
	 * @param queryWrapper 实体对象封装操作类（可以为 null）
	 */
	@Override
	@UserDataPermission
	<E extends IPage<T>> E selectPage(E page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

	/**
	 * 根据 Wrapper 条件，查询全部记录（并翻页）
	 *
	 * @param page         分页查询条件
	 * @param queryWrapper 实体对象封装操作类
	 */
	@Override
	@UserDataPermission
	<E extends IPage<Map<String, Object>>> E selectMapsPage(E page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
}
