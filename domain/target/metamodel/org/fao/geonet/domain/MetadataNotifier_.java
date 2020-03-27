package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataNotifier.class)
public abstract class MetadataNotifier_ {

	public static volatile SingularAttribute<MetadataNotifier, char[]> password;
	public static volatile SingularAttribute<MetadataNotifier, Character> enabled_JPAWorkaround;
	public static volatile SingularAttribute<MetadataNotifier, String> name;
	public static volatile SingularAttribute<MetadataNotifier, Integer> id;
	public static volatile SingularAttribute<MetadataNotifier, String> url;
	public static volatile ListAttribute<MetadataNotifier, MetadataNotification> notifications;
	public static volatile SingularAttribute<MetadataNotifier, String> username;

}

