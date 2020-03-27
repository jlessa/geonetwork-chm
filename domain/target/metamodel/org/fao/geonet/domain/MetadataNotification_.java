package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataNotification.class)
public abstract class MetadataNotification_ {

	public static volatile SingularAttribute<MetadataNotification, Character> notified_JPAWorkaround;
	public static volatile SingularAttribute<MetadataNotification, String> errorMessage;
	public static volatile SingularAttribute<MetadataNotification, MetadataNotificationAction> action;
	public static volatile SingularAttribute<MetadataNotification, MetadataNotificationId> id;
	public static volatile SingularAttribute<MetadataNotification, String> metadataUuid;

}

