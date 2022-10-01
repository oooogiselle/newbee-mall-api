package ltd.newbee.mall.api.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import ltd.newbee.mall.api.admin.param.BatchIdParam;
import ltd.newbee.mall.api.admin.param.CarouselAddParam;
import ltd.newbee.mall.api.admin.param.CarouselEditParam;
import ltd.newbee.mall.common.ServiceResultEnum;
import ltd.newbee.mall.config.annotation.TokenToAdminUser;
import ltd.newbee.mall.entity.AdminUserToken;
import ltd.newbee.mall.entity.Carousel;
import ltd.newbee.mall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.util.BeanUtil;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.Result;
import ltd.newbee.mall.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/search/")
public class NewBeeAdminSearchOrdersAPI {

    private static final Logger logger = LoggerFactory.getLogger(NewBeeAdminCarouselAPI.class);

    @Resource
    NewBeeAdminSearchOrders newBeeAdminSearchOrders;


}
