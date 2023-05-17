# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Long**](.md) |  |  [optional]
**petId** | [**kotlin.Long**](.md) |  |  [optional]
**quantity** | [**kotlin.Int**](.md) |  |  [optional]
**shipDate** | [**org.threeten.bp.LocalDateTime**](org.threeten.bp.LocalDateTime.md) |  |  [optional]
**status** | [**inline**](#Status) | Order Status |  [optional]
**complete** | [**kotlin.Boolean**](.md) |  |  [optional]

<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | placed, approved, delivered
