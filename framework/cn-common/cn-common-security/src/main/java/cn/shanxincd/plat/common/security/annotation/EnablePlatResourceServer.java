/*
 * Copyright (c) 2020 pig4cloud Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.shanxincd.plat.common.security.annotation;

import cn.shanxincd.plat.common.security.component.PlatResourceServerAutoConfiguration;
import cn.shanxincd.plat.common.security.component.PlatResourceServerConfiguration;
import cn.shanxincd.plat.common.security.feign.PlatFeignClientConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

import java.lang.annotation.*;

/**
 * @author lengleng
 * @date 2022-06-04
 * <p>
 * 资源服务注解
 */
@Documented
@Inherited
@EnableMethodSecurity
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Import({ PlatResourceServerAutoConfiguration.class, PlatResourceServerConfiguration.class,
		PlatFeignClientConfiguration.class })
public @interface EnablePlatResourceServer {

}