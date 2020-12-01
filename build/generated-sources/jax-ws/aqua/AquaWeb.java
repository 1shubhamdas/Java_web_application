
package aqua;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Aqua_web", targetNamespace = "http://aqua/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AquaWeb {


    /**
     * 
     * @param price
     * @param description
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "updateOffer", targetNamespace = "http://aqua/", className = "aqua.UpdateOffer")
    @ResponseWrapper(localName = "updateOfferResponse", targetNamespace = "http://aqua/", className = "aqua.UpdateOfferResponse")
    @Action(input = "http://aqua/Aqua_web/updateOfferRequest", output = "http://aqua/Aqua_web/updateOfferResponse")
    public void updateOffer(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "price", targetNamespace = "")
        String price);

    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "deleteOffer", targetNamespace = "http://aqua/", className = "aqua.DeleteOffer")
    @ResponseWrapper(localName = "deleteOfferResponse", targetNamespace = "http://aqua/", className = "aqua.DeleteOfferResponse")
    @Action(input = "http://aqua/Aqua_web/deleteOfferRequest", output = "http://aqua/Aqua_web/deleteOfferResponse")
    public void deleteOffer(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param price
     * @param description
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "insertOffer", targetNamespace = "http://aqua/", className = "aqua.InsertOffer")
    @ResponseWrapper(localName = "insertOfferResponse", targetNamespace = "http://aqua/", className = "aqua.InsertOfferResponse")
    @Action(input = "http://aqua/Aqua_web/insertOfferRequest", output = "http://aqua/Aqua_web/insertOfferResponse")
    public void insertOffer(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "price", targetNamespace = "")
        String price);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchOffer", targetNamespace = "http://aqua/", className = "aqua.SearchOffer")
    @ResponseWrapper(localName = "searchOfferResponse", targetNamespace = "http://aqua/", className = "aqua.SearchOfferResponse")
    @Action(input = "http://aqua/Aqua_web/searchOfferRequest", output = "http://aqua/Aqua_web/searchOfferResponse")
    public List<Object> searchOffer(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
