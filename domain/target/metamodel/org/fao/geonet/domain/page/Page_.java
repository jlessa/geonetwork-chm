package org.fao.geonet.domain.page;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.fao.geonet.domain.page.Page.PageFormat;
import org.fao.geonet.domain.page.Page.PageSection;
import org.fao.geonet.domain.page.Page.PageStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Page.class)
public abstract class Page_ {

	public static volatile SingularAttribute<Page, PageIdentity> pageIdentity;
	public static volatile SingularAttribute<Page, byte[]> data;
	public static volatile SingularAttribute<Page, String> link;
	public static volatile SingularAttribute<Page, PageFormat> format;
	public static volatile ListAttribute<Page, PageSection> sections;
	public static volatile SingularAttribute<Page, PageStatus> status;

}

