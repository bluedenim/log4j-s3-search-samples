package com.van.example;

import com.van.logging.Event;
import com.van.logging.PublishContext;
import com.van.logging.elasticsearch.ElasticsearchConfiguration;
import com.van.logging.elasticsearch.ElasticsearchPublishHelper;


/**
 * Example of a custom Elasticsearch publish helper. This can be a custom implementation of IPublishHelper<Event> or,
 * more likely, a tweak of the default com.van.logging.elasticsearch.ElasticsearchPublishHelper.
 */
public class MyElasticsearchPublishHelper extends ElasticsearchPublishHelper {

    public MyElasticsearchPublishHelper(ElasticsearchConfiguration configuration) {
        super(configuration);
    }

    @Override
    public void start(PublishContext context) {
        System.out.printf("START Publishing from MyElasticsearchPublishHelper...%n");
        super.start(context);
    }

    @Override
    public void publish(PublishContext context, int sequence, Event event) {
        System.out.printf("Publishing from MyElasticsearchPublishHelper...%n");
        super.publish(context, sequence, event);
    }

    @Override
    public void end(PublishContext context) {
        System.out.printf("END publishing a batch from MyElasticsearchPublishHelper...%n");
        super.end(context);
    }
}
