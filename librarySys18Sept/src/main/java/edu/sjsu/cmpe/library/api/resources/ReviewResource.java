package edu.sjsu.cmpe.library.api.resources;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yammer.dropwizard.jersey.params.IntParam;
import com.yammer.metrics.annotation.Timed;

import edu.sjsu.cmpe.library.domain.ReviewDetails;
import edu.sjsu.cmpe.library.dto.LinkDto;
import edu.sjsu.cmpe.library.dto.ReviewDto;

@Path("v1/books/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ReviewResource {
	
	/*private HashMap<Integer, ReviewDetails> reviewMap= new HashMap<Integer, ReviewDetails>();
		
	public ReviewResource()
	{
		
	}
	
	@POST
	@Path("{isbnKey}/reviews")
	@Timed(name="create-review")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ReviewDto addReview(@PathParam("isbnKey") IntParam isbnKey, ReviewDetails review)
	{
		for(ReviewDetails iter: reviewMap.values())
		{
			if(iter.getReviewId()== isbnKey.get())
			{
				int num=reviewMap.size()+1;
				review.setReviewId(num);
				reviewMap.put(num, review);
			}
		}
				
		ReviewDto reviewResponse= new ReviewDto(review);
		reviewResponse.addLink(new LinkDto("view-review","/review/"+review.getReviewId(), "GET"));
		return reviewResponse;
	}
	
	/*@POST
	@Path("{isbnKey}/reviews")
	@Timed(name="create-review")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ReviewDto addReview(@QueryParam("rating") Optional<Integer> rating, @QueryParam("comment") Optional <String> comment, ReviewDetails review, BookDetails book)
	{
		int num=reviewMap.size()+1;
		review.setReviewId(num);
		reviewMap.put(num,review);
		
		ReviewDto reviewResponse= new ReviewDto(review);
		reviewResponse.addLink(new LinkDto("view-review","/books/"+book.getId()+"/review/"+review.getReviewId(), "POST"));
		return reviewResponse;
	}*/
	
	

}
