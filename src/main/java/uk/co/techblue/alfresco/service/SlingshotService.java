package uk.co.techblue.alfresco.service;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.alfresco.dto.content.DocLibRequest;
import uk.co.techblue.alfresco.exception.SlingshotException;
import uk.co.techblue.alfresco.resource.SlingshotResource;

/**
 * Slingshot REST Service 
 * @author horelvis
 *
 */
public class SlingshotService extends AbstractService<SlingshotResource> {
	
	final int pos = 1;
	
	public SlingshotService(String restBaseUri, String authTicket) {
		 super(restBaseUri, authTicket);
	}

	/**
	 * Get doc list used  
	 * @param type 
	 * @param site site name
	 * @param container 
	 * @param filter all - recentlyAdded -recentlyModified - recentlyCreatedByMe
	 * @param pos
	 * @param sortField field to sort
	 * @return
	 * @throws SlingshotException
	 */
    public String doclib(final String type, final String location, final String path, final String filter,final String sortField) throws SlingshotException {
    	DocLibRequest params = new DocLibRequest();
    	params.setSortField(sortField);
    	params.setFilter(filter);
    	params.setPos(pos);
    	
        final ClientResponse<String> slingshotResponse = resourceProxy.doclib(authTicket,type,location, path, params);
        		
        return parseEntityFromResponse(slingshotResponse, SlingshotException.class);
    }
    
    /**
     * Get tree folder by path
     * @param path
     * @return folder list
     * @throws SlingshotException
     */
	public String treeNode(String path) throws SlingshotException{
		 final ClientResponse<String> slingshotResponse = resourceProxy.treenode(authTicket, path);
 		
	        return parseEntityFromResponse(slingshotResponse, SlingshotException.class);
	}
	
	/**
	 * @see uk.co.techblue.alfresco.client.Service#getResourceClass()
	 */
	@Override
	protected Class<SlingshotResource> getResourceClass() {
		return SlingshotResource.class;
	}

}
