package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.fao.geonet.domain.userfeedback.UserFeedback;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Metadata.class)
public abstract class Metadata_ extends org.fao.geonet.domain.AbstractMetadata_ {

	public static volatile ListAttribute<Metadata, UserFeedback> userFeedbacks;
	public static volatile SetAttribute<Metadata, MetadataCategory> metadataCategories;

}

