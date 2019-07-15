package com.ikaimen.log.filter;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import com.ikaimen.log.type.LogTypeEnum;

/**
 * @ClassName StatusLogFilter
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/25 10:41 AM
 * @ModifyDate 2019/6/25 10:41 AM
 * @Version 1.0
 */
public class StatusLogFilter extends Filter<ILoggingEvent> {

    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if ( iLoggingEvent.getMessage() != null && iLoggingEvent.getMessage().contains(LogTypeEnum.STATE.getCode()))
        {
            return FilterReply.ACCEPT;
        }
        return FilterReply.DENY;

    }
}
