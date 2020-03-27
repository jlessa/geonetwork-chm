package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Source.class)
public abstract class Source_ {

	public static volatile SingularAttribute<Source, String> filter;
	public static volatile MapAttribute<Source, String, String> labelTranslations;
	public static volatile SingularAttribute<Source, Integer> groupOwner;
	public static volatile SingularAttribute<Source, String> name;
	public static volatile SingularAttribute<Source, String> logo;
	public static volatile SingularAttribute<Source, String> uiConfig;
	public static volatile SingularAttribute<Source, SourceType> type;
	public static volatile SingularAttribute<Source, ISODate> creationDate;
	public static volatile SingularAttribute<Source, String> serviceRecord;
	public static volatile SingularAttribute<Source, String> uuid;

}

