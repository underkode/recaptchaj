package studio.inkode.http;

/**
 * Created on 11.10.2018.
 *
 * @author Maxim Seredkin
 */
public class HttpServerErrorException extends Exception {
    public HttpServerErrorException(int responseCode, String responseMessage) {}
}
