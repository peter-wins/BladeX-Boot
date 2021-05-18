INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1394607810083295238', 0, 'blade-develop', 'customer', 'menu', '/blade-develop/customer', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1394607810083295239', '1394607810083295238', 'customer_add', '新增', 'add', '/blade-develop/customer/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1394607810083295240', '1394607810083295238', 'customer_edit', '修改', 'edit', '/blade-develop/customer/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1394607810083295241', '1394607810083295238', 'customer_delete', '删除', 'delete', '/api/blade-develop/customer/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1394607810083295242', '1394607810083295238', 'customer_view', '查看', 'view', '/blade-develop/customer/view', 'file-text', 4, 2, 2, 1, NULL, 0);
