package dbot.camunda.workflow.activity;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class Service1Activity implements JavaDelegate {
    private static final Logger logger = LoggerFactory.getLogger(Service1Activity.class);

    @PostConstruct
    public void init() {
        logger.info("Created instance of {}", this.getClass().getSimpleName() );
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info("In Service 1");
        delegateExecution.setVariable("stuff", LocalDate.now());
    }
}
