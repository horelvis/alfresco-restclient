package uk.co.techblue.alfresco.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.Form;
import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.alfresco.client.Resource;
import uk.co.techblue.alfresco.commons.AlfrescoConstants;
import uk.co.techblue.alfresco.dto.content.DocLibRequest;

/**
 * 
 * @author horelvis
 * Slingshot Resource Interface
 */
@Path(AlfrescoConstants.RESOURCE_SLINGSHOT_CONTEXT_BASE_PATH)
public interface SlingshotResource extends Resource {
	
	 
    @GET
    @Path("/slingshot/doclib/doclist/all/{path}/")
    @Produces(MediaType.APPLICATION_JSON)
    ClientResponse<String> doclib(@QueryParam(AlfrescoConstants.AUTH_TICKET_PARAM_NAME) final String ticket,@PathParam("path") final String path ,@Form DocLibRequest params);

}
