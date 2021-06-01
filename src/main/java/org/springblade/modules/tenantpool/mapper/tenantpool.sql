INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685409612500998', 0, 'tenantpool', 'tenantpool', 'menu', '/tenantpool/tenantpool', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685409612500999', '1399685409612500998', 'tenantpool_add', '新增', 'add', '/tenantpool/tenantpool/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685409612501000', '1399685409612500998', 'tenantpool_edit', '修改', 'edit', '/tenantpool/tenantpool/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685409612501001', '1399685409612500998', 'tenantpool_delete', '删除', 'delete', '/api/tenantpool/tenantpool/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1399685409612501002', '1399685409612500998', 'tenantpool_view', '查看', 'view', '/tenantpool/tenantpool/view', 'file-text', 4, 2, 2, 1, NULL, 0);
