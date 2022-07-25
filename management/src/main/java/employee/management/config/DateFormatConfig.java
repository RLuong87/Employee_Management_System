package employee.management.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.format.support.FormattingConversionService;

import java.time.format.DateTimeFormatter;

@Configuration(proxyBeanMethods = false)
public class DateFormatConfig {

    @Autowired
    public void configure(final FormattingConversionService conversionService) {
        registrar.registerFormatters(conversionService);
    }

    private final DateTimeFormatterRegistrar registrar =
            new DateTimeFormatterRegistrar();

    public void DateFormatConfiguration() {
        registrar.setDateFormatter(
                DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        registrar.setTimeFormatter(
                DateTimeFormatter.ofPattern("HH:mm:ss"));
        registrar.setDateTimeFormatter(
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
    }
}
