INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400046928149876743', 0, 'ownerpool', 'ownerpool_listings_detail', 'menu', '/ownerpool/ownerpool_listings_detail', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400046928149876744', '1400046928149876743', 'ownerpool_listings_detail_add', '新增', 'add', '/ownerpool/ownerpool_listings_detail/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400046928149876745', '1400046928149876743', 'ownerpool_listings_detail_edit', '修改', 'edit', '/ownerpool/ownerpool_listings_detail/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400046928149876746', '1400046928149876743', 'ownerpool_listings_detail_delete', '删除', 'delete', '/api/ownerpool/ownerpool_listings_detail/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400046928149876747', '1400046928149876743', 'ownerpool_listings_detail_view', '查看', 'view', '/ownerpool/ownerpool_listings_detail/view', 'file-text', 4, 2, 2, 1, NULL, 0);
