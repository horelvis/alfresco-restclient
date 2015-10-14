package uk.co.techblue.alfresco.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.alfresco.client.Resource;
import uk.co.techblue.alfresco.commons.AlfrescoConstants;

/**
 * 
 * @author horelvis
 * Slingshot Resource Interface
 */
@Path(AlfrescoConstants.RESOURCE_CONTEXT_BASE_PATH)
public interface SlingshotResource extends Resource {
	
	 /**
     * Creates the folder.
     * 
     * @param ticket the ticket
     * @param storeType the store type
     * @param storeId the store id
     * @param nodeId the node id
     * @param folderName the folder name
     * @return the client response
     */
    @GET
    @Path("/folder/create/{store_type}/{store_id}/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    ClientResponse<String> browser(@QueryParam(AlfrescoConstants.AUTH_TICKET_PARAM_NAME) final String ticket,
        @PathParam("store_type") final String storeType, @PathParam("store_id") final String storeId, @PathParam("id") String nodeId, @QueryParam("folderName") String folderName);

}
