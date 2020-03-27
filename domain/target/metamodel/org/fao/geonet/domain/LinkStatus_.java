package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LinkStatus.class)
public abstract class LinkStatus_ {

	public static volatile SingularAttribute<LinkStatus, String> batchKey;
	public static volatile SingularAttribute<LinkStatus, String> statusInfo;
	public static volatile SingularAttribute<LinkStatus, String> statusValue;
	public static volatile SingularAttribute<LinkStatus, Link> link;
	public static volatile SingularAttribute<LinkStatus, Boolean> failing;
	public static volatile SingularAttribute<LinkStatus, Integer> id;
	public static volatile SingularAttribute<LinkStatus, ISODate> checkDate;

}

