package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InspireAtomFeed.class)
public abstract class InspireAtomFeed_ {

	public static volatile SingularAttribute<InspireAtomFeed, String> authorEmail;
	public static volatile SingularAttribute<InspireAtomFeed, String> atomUrl;
	public static volatile SingularAttribute<InspireAtomFeed, String> atomDatasetns;
	public static volatile SingularAttribute<InspireAtomFeed, String> title;
	public static volatile SingularAttribute<InspireAtomFeed, String> atomDatasetid;
	public static volatile SingularAttribute<InspireAtomFeed, Integer> metadataId;
	public static volatile SingularAttribute<InspireAtomFeed, String> authorName;
	public static volatile SingularAttribute<InspireAtomFeed, String> subtitle;
	public static volatile SingularAttribute<InspireAtomFeed, String> rights;
	public static volatile ListAttribute<InspireAtomFeed, InspireAtomFeedEntry> entryList;
	public static volatile SingularAttribute<InspireAtomFeed, Integer> id;
	public static volatile SingularAttribute<InspireAtomFeed, String> atom;
	public static volatile SingularAttribute<InspireAtomFeed, String> lang;

}

