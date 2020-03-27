package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractMetadata.class)
public abstract class AbstractMetadata_ {

	public static volatile SingularAttribute<AbstractMetadata, MetadataSourceInfo> sourceInfo;
	public static volatile SingularAttribute<AbstractMetadata, String> data;
	public static volatile SingularAttribute<AbstractMetadata, MetadataDataInfo> dataInfo;
	public static volatile SingularAttribute<AbstractMetadata, Integer> id;
	public static volatile SingularAttribute<AbstractMetadata, String> uuid;
	public static volatile SingularAttribute<AbstractMetadata, MetadataHarvestInfo> harvestInfo;

}

