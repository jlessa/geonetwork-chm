package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataStatus.class)
public abstract class MetadataStatus_ {

	public static volatile SingularAttribute<MetadataStatus, Integer> owner;
	public static volatile SingularAttribute<MetadataStatus, ISODate> closeDate;
	public static volatile SingularAttribute<MetadataStatus, StatusValue> statusValue;
	public static volatile SingularAttribute<MetadataStatus, ISODate> dueDate;
	public static volatile SingularAttribute<MetadataStatus, String> changeMessage;
	public static volatile SingularAttribute<MetadataStatus, MetadataStatusId> id;
	public static volatile SingularAttribute<MetadataStatus, String> currentState;
	public static volatile SingularAttribute<MetadataStatus, String> previousState;

}

