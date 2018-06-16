package dbot.camunda.workflow.activity;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class Service2Activity implements JavaDelegate {
    private static final Logger logger = LoggerFactory.getLogger(Service2Activity.class);

    @PostConstruct
    public void init() {
        logger.info("Created instance of {}", this.getClass().getSimpleName() );
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info("In Service 2");
        LocalDate stored = (LocalDate) delegateExecution.getVariable("stuff");
        logger.info("I got stored value: {}", stored.toString());
    }
}
