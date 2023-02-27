package com.barclays.reclite.connector.config;

import com.barclays.reclite.connector.model.SinkBean;
import com.barclays.reclite.connector.model.SinkCsvRecord;
import org.springframework.stereotype.Component;

@Component
public class CsvRecordToSinkBeanMapper {

    public SinkBean convertAndTransform(SinkCsvRecord csvRecord) {
        final SinkBean sinkBean = new SinkBean();
        sinkBean.setDepartmentCode(csvRecord.getDepartmentCode());
        sinkBean.setDepartmentName(csvRecord.getDepartmentName());
        return sinkBean;
    }
}