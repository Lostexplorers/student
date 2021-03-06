package zm.village.service;

import java.util.List;
import zm.village.dao.Breed;

/**
 * @author 伍伴
 * @Date 2018年7月21日
 * @Description 养殖类服务层
 * @version 1.0
 */

public interface RelBreedService {

	 /**
     * @param 养殖ID
     * @return 删除的行数
     */
    int delete(Breed record);
    
    /**
     * @param 养殖ID
     * @return 删除的行数
     */
    int delete(Integer record);

    /**
     * @param 养殖信息
     * @return 插入的主键
     */
    int insert(Breed record);

    /**
     * @param 养殖ID
     * @return 养殖信息
     */
    Breed select(Breed record);
    
    
    /**
     * @param 养殖ID
     * @return 养殖信息
     */
    Breed getById(Integer record);
    
    /**
     * @param 土地ID
     * @return 养殖数组信息
     */
    List<Breed> getByLandId(Integer landId);

    /**
     * @param 养殖信息
     * @return 更新的行数
     */
    int update(Breed record);
    
    /**
     * @return 养殖信息列表
     */
    List<Breed> selectAll();
    
    /**
     * @param 养殖ID列表
     * @return 删除行数
     */
    int deleteMany(Integer[] record);
}
