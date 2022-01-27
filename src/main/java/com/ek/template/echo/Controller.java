package com.ek.template.echo;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/service")
public class Controller {

    private static final Logger LOG = LoggerFactory.getLogger(EchoApplication.class);

    @PostMapping()
    public ResponseEntity<String> echo(@RequestBody String reqBody, @RequestHeader MultiValueMap<String, String> headers) { 
        LOG.info("Entering echo with request body: " + reqBody);

        headers.forEach((key, value) -> {
            LOG.info(String.format(
                    "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
        });
        String resBody = reqBody;

        return ResponseEntity.ok().body(resBody);
    }
}
