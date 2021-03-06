package io.datanerds.rappelkiste.specification.util

import org.slf4j.LoggerFactory

class Configuration {

    static URI[] servers
    def static logger = LoggerFactory.getLogger(Configuration.class)

    public Configuration() {
        getServersFromProperty()
    }

    private static getServersFromProperty() {
        def baseUrls = System.getProperty(Constants.CommandLine.BASE_URL_PROPERTY, "http://localhost:8080")
        servers = baseUrls.split(',').collect{value -> new URI(value)}
    }
}
