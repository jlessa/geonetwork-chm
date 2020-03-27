package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Link.class)
public abstract class Link_ {

	public static volatile SetAttribute<Link, LinkStatus> linkStatus;
	public static volatile SingularAttribute<Link, String> protocol;
	public static volatile SingularAttribute<Link, ISODate> lastCheck;
	public static volatile SetAttribute<Link, MetadataLink> records;
	public static volatile SingularAttribute<Link, LinkType> linkType;
	public static volatile SingularAttribute<Link, Integer> id;
	public static volatile SingularAttribute<Link, Integer> lastState;
	public static volatile SingularAttribute<Link, String> url;

}

