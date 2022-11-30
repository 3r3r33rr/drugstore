package com.example.webproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.injector.methods.DeleteBatchByIds;
import com.example.webproject.dto.Result;
import com.example.webproject.entity.ShoppingCart;
import com.example.webproject.mapper.ShoppingCartMapper;
import com.example.webproject.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.sf.jsqlparser.statement.delete.Delete;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

    @Override
    public Result addCart(ShoppingCart shoppingCart) {
        boolean isSaved = save(shoppingCart);
        if (isSaved){
            return Result.ok("添加购物车成功!");
        }else{
            return Result.fail("添加购物车失败");
        }
    }

    @Override
    public Result getAll() {
        List<ShoppingCart> list = list();
        return Result.ok(list);
    }

    @Override
    public Result selectById(Integer userId) {
        List<ShoppingCart> list = query().eq("db_userid", userId).list();
        if(list==null||list.isEmpty()){
            return Result.fail("该用户未添加购物车");
        }else{
            return Result.ok(list);
        }
    }

    @Override
    public Result updateCart(ShoppingCart shoppingCart) {
        if (shoppingCart==null||shoppingCart.getCount()==null){
            return Result.fail("传入的购物车信息不全!");
        }
        UpdateWrapper<ShoppingCart>warp=new UpdateWrapper<>();
        warp.set("db_amount", shoppingCart.getCount()).eq("db_userid", shoppingCart.getUserId()).eq("db_drugid", shoppingCart.getDrugId());
        boolean update = update(warp);
        if(!update){
            return Result.fail("更新数据失败");
        }else{
            return Result.ok("更新成功");
        }
    }

    @Override
    public Result deleteCart(Integer userid, Integer drugid) {
        QueryWrapper<ShoppingCart> shoppingCartQueryWrapper=new QueryWrapper<>();
        shoppingCartQueryWrapper.eq("db_userid",userid);
        shoppingCartQueryWrapper.eq("db_drugid",drugid);
        boolean isRemoved=remove(shoppingCartQueryWrapper);
        if (!isRemoved){
            return Result.fail("删除购物车失败");
        }
        return Result.ok("删除成功");
    }


}
