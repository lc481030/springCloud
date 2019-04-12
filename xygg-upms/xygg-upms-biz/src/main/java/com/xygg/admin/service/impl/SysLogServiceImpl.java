/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xygg.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xygg.admin.api.entity.SysLog;
import com.xygg.admin.service.SysLogService;
import com.xygg.admin.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author lichao
 * @since 2019/2/1
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

}
