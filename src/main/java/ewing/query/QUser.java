package ewing.query;

import static com.querydsl.core.types.PathMetadataFactory.*;
import ewing.entity.User;


import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUser extends com.querydsl.sql.RelationalPathBase<User> {

    private static final long serialVersionUID = 946204696;

    public static final QUser user = new QUser("user");

    public final DateTimePath<java.util.Date> birthday = createDateTime("birthday", java.util.Date.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath password = createString("password");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<User> primary = createPrimaryKey(userId);

    public QUser(String variable) {
        super(User.class, forVariable(variable), "null", "user");
        addMetadata();
    }

    public QUser(String variable, String schema, String table) {
        super(User.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUser(String variable, String schema) {
        super(User.class, forVariable(variable), schema, "user");
        addMetadata();
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata(), "null", "user");
        addMetadata();
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata, "null", "user");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(birthday, ColumnMetadata.named("birthday").withIndex(4).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(createTime, ColumnMetadata.named("create_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(password, ColumnMetadata.named("password").withIndex(3).ofType(Types.VARCHAR).withSize(32).notNull());
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(username, ColumnMetadata.named("username").withIndex(2).ofType(Types.VARCHAR).withSize(64).notNull());
    }

}

