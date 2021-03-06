/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.undertow;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class UndertowEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        UndertowEndpoint target = (UndertowEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesslog":
        case "accessLog": target.setAccessLog(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "accesslogreceiver":
        case "accessLogReceiver": target.setAccessLogReceiver(property(camelContext, io.undertow.server.handlers.accesslog.AccessLogReceiver.class, value)); return true;
        case "allowedroles":
        case "allowedRoles": target.setAllowedRoles(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cookiehandler":
        case "cookieHandler": target.setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "firewebsocketchannelevents":
        case "fireWebSocketChannelEvents": target.setFireWebSocketChannelEvents(property(camelContext, boolean.class, value)); return true;
        case "handlers": target.setHandlers(property(camelContext, java.lang.String.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "httpmethodrestrict":
        case "httpMethodRestrict": target.setHttpMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "keepalive":
        case "keepAlive": target.setKeepAlive(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "matchonuriprefix":
        case "matchOnUriPrefix": target.setMatchOnUriPrefix(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "muteexception":
        case "muteException": target.setMuteException(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "options": target.setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "optionsenabled":
        case "optionsEnabled": target.setOptionsEnabled(property(camelContext, boolean.class, value)); return true;
        case "preservehostheader":
        case "preserveHostHeader": target.setPreserveHostHeader(property(camelContext, boolean.class, value)); return true;
        case "reuseaddresses":
        case "reuseAddresses": target.setReuseAddresses(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "securityconfiguration":
        case "securityConfiguration": target.setSecurityConfiguration(property(camelContext, java.lang.Object.class, value)); return true;
        case "sendtimeout":
        case "sendTimeout": target.setSendTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.setSendToAll(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay":
        case "tcpNoDelay": target.setTcpNoDelay(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": target.setThrowExceptionOnFailure(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "transferexception":
        case "transferException": target.setTransferException(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "undertowhttpbinding":
        case "undertowHttpBinding": target.setUndertowHttpBinding(property(camelContext, org.apache.camel.component.undertow.UndertowHttpBinding.class, value)); return true;
        case "usestreaming":
        case "useStreaming": target.setUseStreaming(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessLog", java.lang.Boolean.class);
        answer.put("accessLogReceiver", io.undertow.server.handlers.accesslog.AccessLogReceiver.class);
        answer.put("allowedRoles", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("cookieHandler", org.apache.camel.http.base.cookie.CookieHandler.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("fireWebSocketChannelEvents", boolean.class);
        answer.put("handlers", java.lang.String.class);
        answer.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        answer.put("httpMethodRestrict", java.lang.String.class);
        answer.put("keepAlive", java.lang.Boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("matchOnUriPrefix", java.lang.Boolean.class);
        answer.put("muteException", java.lang.Boolean.class);
        answer.put("options", java.util.Map.class);
        answer.put("optionsEnabled", boolean.class);
        answer.put("preserveHostHeader", boolean.class);
        answer.put("reuseAddresses", java.lang.Boolean.class);
        answer.put("securityConfiguration", java.lang.Object.class);
        answer.put("sendTimeout", java.lang.Integer.class);
        answer.put("sendToAll", java.lang.Boolean.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("synchronous", boolean.class);
        answer.put("tcpNoDelay", java.lang.Boolean.class);
        answer.put("throwExceptionOnFailure", java.lang.Boolean.class);
        answer.put("transferException", java.lang.Boolean.class);
        answer.put("undertowHttpBinding", org.apache.camel.component.undertow.UndertowHttpBinding.class);
        answer.put("useStreaming", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        UndertowEndpoint target = (UndertowEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesslog":
        case "accessLog": return target.getAccessLog();
        case "accesslogreceiver":
        case "accessLogReceiver": return target.getAccessLogReceiver();
        case "allowedroles":
        case "allowedRoles": return target.getAllowedRoles();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cookiehandler":
        case "cookieHandler": return target.getCookieHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "firewebsocketchannelevents":
        case "fireWebSocketChannelEvents": return target.isFireWebSocketChannelEvents();
        case "handlers": return target.getHandlers();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "httpmethodrestrict":
        case "httpMethodRestrict": return target.getHttpMethodRestrict();
        case "keepalive":
        case "keepAlive": return target.getKeepAlive();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "matchonuriprefix":
        case "matchOnUriPrefix": return target.getMatchOnUriPrefix();
        case "muteexception":
        case "muteException": return target.getMuteException();
        case "options": return target.getOptions();
        case "optionsenabled":
        case "optionsEnabled": return target.isOptionsEnabled();
        case "preservehostheader":
        case "preserveHostHeader": return target.isPreserveHostHeader();
        case "reuseaddresses":
        case "reuseAddresses": return target.getReuseAddresses();
        case "securityconfiguration":
        case "securityConfiguration": return target.getSecurityConfiguration();
        case "sendtimeout":
        case "sendTimeout": return target.getSendTimeout();
        case "sendtoall":
        case "sendToAll": return target.getSendToAll();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "tcpnodelay":
        case "tcpNoDelay": return target.getTcpNoDelay();
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return target.getThrowExceptionOnFailure();
        case "transferexception":
        case "transferException": return target.getTransferException();
        case "undertowhttpbinding":
        case "undertowHttpBinding": return target.getUndertowHttpBinding();
        case "usestreaming":
        case "useStreaming": return target.isUseStreaming();
        default: return null;
        }
    }
}

